echo "Will start deploy_to_git"

git config --global user.email "build@marcelosantosti.github.io"
echo "Set email"
git config --global user.name "build"
echo "Set user names"

git tag -a v1.0 -m "[skip ci] Version $versionName tag."

git push --tags